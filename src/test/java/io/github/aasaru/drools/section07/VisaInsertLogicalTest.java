/*
 * Copyright 2017 Juhan Aasaru.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.aasaru.drools.section07;

import org.junit.jupiter.api.Test;

public class VisaInsertLogicalTest {

  @Test
  public void shouldExecuteAllSteps() {
    VisaInsertLogical.execute(1);
    VisaInsertLogical.execute(2);
    VisaInsertLogical.execute(3);
    VisaInsertLogical.execute(4);
    VisaInsertLogical.execute(5);
  }

}