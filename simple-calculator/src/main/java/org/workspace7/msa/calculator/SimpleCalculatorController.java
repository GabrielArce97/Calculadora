package org.workspace7.msa.calculator;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import Model.Division;
import Model.Multiplicacion;
import Model.Resta;
import Model.Suma;
//import javax.ws.rs.PathParam;

//http://localhost:8080/swagger-ui.html#!/simple-calculator-controller/addUsingGET (URL para hacer las operaciones)
@RestController //servicio rest
@RequestMapping("/api")
public class SimpleCalculatorController {

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/add/{num1}/{num2}", produces = "text/plain")//mapeo por medio del metodo get donde se le asignan valores por parametro
    @ApiOperation("Suma de dos numeros")//informacion de la operacion
    public String add(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) { //se asignan valores tipo double a las variables asignadas en el path.
    	Suma sum = new Suma(num1, num2);//se crea una nueva operacion
        return String.format("%f + %f = %f", num1, num2, sum.getRes());//se le define un valor tipo string donde muestre el resultado en el ResponseBody de SwaggerUI.
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/sub/{num1}/{num2}", produces = "text/plain")//resta
    @ApiOperation("Resta de dos numeros")
    public String sub(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
    	Resta resta = new Resta(num1, num2);
        return String.format("%f - %f = %f", num1, num2, resta.getRes());
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/mul/{num1}/{num2}", produces = "text/plain")//multiplicacion
    @ApiOperation("Multiplicacion de dos numeros")
    public String mul(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
    	Multiplicacion multi = new Multiplicacion(num1,num2);
        return String.format("%f x %f = %f", num1, num2, multi.getRes());
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/div/{num1}/{num2}", produces = "text/plain")//division
    @ApiOperation("Division entre dos numeros")
    public String div(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
    	if(num2 == 0) { //exception
        	return String.format("%d", "");
        }else {
        	Division div = new Division(num1, num2);
        	return String.format("%f / %f = %f", num1, num2, div.getRes());
        }
    	
    }
}
