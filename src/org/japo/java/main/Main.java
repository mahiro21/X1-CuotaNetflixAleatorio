/* 
 * 
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

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public final class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        // Constantes y variables
        final double CUOTA_MIN = 0;
        final double CUOTA_MAX = 30;
        double CUOTA_A = RND.nextDouble() * (CUOTA_MAX - CUOTA_MIN) + CUOTA_MIN;
        double CUOTA_B = CUOTA_MAX - CUOTA_A;
        double CUOTA_NETFLIX = CUOTA_A + CUOTA_B;
        // Generar dato

        System.out.printf("AMIGO_A PAGA: %.2f€%nAMIGO_B PAGA: %.2f€%nCUOTA NETFLIX: %.2f  ", CUOTA_A, CUOTA_B, CUOTA_NETFLIX);
    }
}
