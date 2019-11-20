/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {
        
        //Constantes
        final String NOMBRE = "Jaimito";
        final String ENCARGO = "Patatas";
        final int PRO_ENCAR = 3;
        final double PRE_ENC = 0.30;
        final double DIN_SUM = 1.00;
        final String ART_IMPRE = "Piruleta";
        final double PRE_IMPRE = 0.20;
        
        //Variables
        double canRest = (DIN_SUM - PRE_IMPRE);
        double cantComp = canRest / PRE_ENC;
        double dinDev = canRest % PRE_ENC;
        
        //Cabecera
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        
        //Cuerpo1
        System.out.printf("Persona encargada .....: %s%n", NOMBRE);
        System.out.printf("Artículo encargado ....: %s%n", ENCARGO);
        System.out.printf("Cantidad encargada ....: %d kg%n", PRO_ENCAR);
        
        //Separador
        System.out.println("---");
        
        //Cuerpo2
        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.2f €/kg%n", PRE_ENC);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.2f €%n", DIN_SUM);
        
        //Separador
        System.out.println("---");
        
        //Cuerpo3
        System.out.printf("Artículo imprevisto ...: %s%n", ART_IMPRE);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.2f €%n", PRE_IMPRE);
        
        //Separador
        System.out.println("---");
        
        //Conclusion
        System.out.printf("Cantidad comprada .....: %d kg%n", (int)cantComp);
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.2f €%n", dinDev);
        
        
        
    }
}
