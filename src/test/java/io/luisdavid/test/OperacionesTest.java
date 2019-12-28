package io.luisdavid.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones oper;

    //para instanciar en todos los metodos el objeto
       @Before
       public void setup(){

           oper = new Operaciones();
       }

    @Test
    public void sumartest() {


        //ASSERT ES PARA PREGUNTAS EN PRUEBAS
        Assert.assertEquals("La suma es: ", 11, oper.sumar(5, 6));


    }
    @Test
    public void restratest() {


        Assert.assertEquals("La resta es: ", 30, oper.restar(36, 6));


    }
    @Test
    public void multiplicaciontest() {


        Assert.assertEquals("La Multiplicacion es: ", 36, oper.multiplicar(6, 6));


    }
    @Test
    public void divisiontest() {


        Assert.assertEquals("La Division es: ", 4, oper.dividir(32, 8));


    }

    }
