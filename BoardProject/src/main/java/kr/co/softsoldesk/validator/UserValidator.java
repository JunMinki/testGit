package kr.co.softsoldesk.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.co.softsoldesk.beans.UserBean;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return UserBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// target이 모든 userBean을 가져옴 (joinUserBean뿐만 아니라 tempLoginUserBean등 모두 가져와서 문제가
		// 발생)

		UserBean userBean = (UserBean) target;

		// 객체명 확인
		String beanName = errors.getObjectName();
		// System.out.println(beanName);

		if (beanName.equals("joinUserBean") || beanName.equals("modifyUserBean")) {

			// 비밀번호와 비밀번호확인의 불일치
			if (userBean.getUser_pw().equals(userBean.getUser_pw2()) == false) {

				errors.rejectValue("user_pw", "NotEquals");
				errors.rejectValue("user_pw2", "NotEquals");
			}

			if (beanName.equals("joinUserBean")) {
				// 중복확인을 위해 존재!!!
				if (userBean.isUserIdExist() == false) {
					errors.rejectValue("user_id", "DontcheckUserIdExist");
				}
			}

		}
	}
}
