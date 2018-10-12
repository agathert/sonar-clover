/*
 * Sonar Clover Plugin
 * Copyright (C) 2018 Tony Proum
 * https://github.com/Tony-Proum/sonar-clover
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.clover;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class CloverPluginTest {

  @Test
  public void test_getExtensions() {
    assertThat(new CloverPlugin().getExtensions()).hasSize(1);
  }
}
