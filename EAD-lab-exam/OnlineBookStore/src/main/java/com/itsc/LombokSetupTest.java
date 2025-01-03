package com.itsc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class LombokSetupTest {
	public class TestLombok {
	    private String message;

	    public static void main(String[] args) {
	        TestLombok test = new TestLombok();
	        test.setMessage("Lombok is working!");
	        System.out.println(test.getMessage());
	    }
	}


}
