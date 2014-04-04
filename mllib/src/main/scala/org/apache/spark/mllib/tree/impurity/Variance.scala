/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.mllib.tree.impurity

/**
 * Class for calculating variance during regression
 */
object Variance extends Impurity {
   override def calculate(c0: Double, c1: Double): Double =
     throw new UnsupportedOperationException("Variance.calculate")

  /**
   * variance calculation
   * @param count number of instances
   * @param sum sum of labels
   * @param sumSquares summation of squares of the labels
   */
  override def calculate(count: Double, sum: Double, sumSquares: Double): Double = {
    val squaredLoss = sumSquares - (sum * sum) / count
    squaredLoss / count
  }
}
