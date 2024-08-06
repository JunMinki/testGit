package kr.co.softsoldesk.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.co.softsoldesk.beans.DataBean8;

public class DataBean8Validator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {//해당 클래스가 유효성 검사가 가능한지 확인해줌
		
		return DataBean8.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {//유효성 실패시 에러에 대한 메시지
		
//		ValidationUtils.rejectIfEmpty(errors, "data2", "error2");//값이 null이거나 길이가 0인 경우 에러
//		//유효성 검사 위배시 error2에 에러 정보를 저장
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data3", "error3");//값이 null이거나 길이가 0 또는 공백으로 구성되어 있으면 에러
		
		DataBean8 bean = (DataBean8) target;
		
		String data2 = bean.getData2();
		String data3 = bean.getData3();
		
		if(data2.length() > 10 ) {
			errors.rejectValue("data2", "error4");
		}
		if(data3.contains("@")==false) {
			errors.rejectValue("data3", "error5");
		}
		
	}
	
}
