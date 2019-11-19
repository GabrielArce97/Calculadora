package org.workspace7.msa.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import Model.Suma;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class,args); //corre el WS
//    	double num1 = 1;
//    	double num2 = 2;
//        Suma sum = new Suma(num1, num2);
//    	double resSum = sum.getRes();
//    	System.out.print(resSum);
    }
}
