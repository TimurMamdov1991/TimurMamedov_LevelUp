package homework_number.task_3.CalculatorFunction.BaseDataProvider;

import org.testng.annotations.DataProvider;

public class BaseDataProvider {

  @DataProvider
  public static Object[][] sumDataProvider() {
    return new Object[][]{
            {2, 2, 4},
            {4, 2, 6},
            {11, 22, 33},
            {2, 3, 5}
    };
  }

  @DataProvider
  public static Object[][] sumDoubleDataProvider() {
    return new Object[][]{
            {2, 2, 4},
            {4, 2, 6},
            {11, 22, 33},
            {2, 3, 5}
    };
  }


  @DataProvider
  public static Object[][] multiplyProvider() {
    return new Object[][]{
            {2, 2, 4},
            {3, 3, 9},
            {4, 4, 16},
            {5, 5, 25}
      };
    }


  @DataProvider
  public static Object[][] multiplyDoubleProvider() {
    return new Object[][]{
            {2.0, 2.0, 4.0},
            {3.0, 3.0, 9.0},
            {4.0, 4.0, 16.0},
            {5.0, 5.0, 25.0}
    };
  }

  @DataProvider
  public static Object[][] testSubProvider() {
    return new Object[][]{
            {2, 2, 0},
            {3, 3, 0},
            {4, 4, 0},
            {5, 5, 0}
    };
  }

  @DataProvider
  public static Object[][] testSubDoubleProvider() {
    return new Object[][]{
            {2.0, 2.0, 0.0},
            {3.0, 3.0, 0.0},
            {4.0, 4.0, 0.0},
            {6.0, 5.0, 1.0}
    };
  }

  @DataProvider
  public static Object[][] testPowProvider() {
    return new Object[][]{
            {2.0, 2.0, 4.0},
            {3.0, 3.0, 27.0},
            {4.0, 4.0, 256.0},
            {6.0, 2.0, 36.0}
    };
  }

  @DataProvider
  public static Object[][] divDataProvider() {
    return new Object[][]{
            {2, 2, 1},
            {4, 2, 2},
            {22, 11, 2},
            {6, 3, 2}
    };
  }

  @DataProvider
  public static Object[][] divDoubleDataProvider() {
    return new Object[][]{
            {2.0, 2.0, 1.0},
            {3.0, 3.0, 1.0},
            {4.0, 4.0, 1.0},
            {6.0, 5.0, 1.2}
    };
  }

  @DataProvider
  public static Object[][] sqrtProvider() {
    return new Object[][] {
            {0, 0},
            {4, 2},
            {9 ,3.0},
            {25.0 ,5.0}
    };
  }

  @DataProvider
  public static Object[][] tgDataProvider() {
    return new Object[][] {
            {0, 0},
            {Math.toRadians(45),1},
            {Math.toRadians(60), 1.732},
            {Math.toRadians(180), 0},
    };
  }

  @DataProvider
  public static Object[][] ctgDataProvider() {
    return new Object[][] {
            {Math.toRadians(30),1.732},
            {Math.toRadians(45),1},
            {Math.toRadians(90), 0},
            {Math.toRadians(120), -0.577},
    };
  }

  @DataProvider
  public static Object[][] cosDataProvider() {
    return new Object[][] {
            {0, 1},
            {(Math.PI/3) ,0.5},
            {(Math.PI/2), 0},
            {(Math.PI), -1},
    };
  }

  @DataProvider
  public static Object[][] SinDataProvider() {
    return new Object[][] {
            {0, 0},
            {Math.PI/6,0.5},
            {Math.PI/2, 1},
            {2, 0.909},
    };
  }

  @DataProvider
  public static Object[][] PositiveDataProvider() {
    return new Object[][] {
            {8 ,true},
            {67 ,true},
            {-4, false},
            {0, false},
    };
  }

  @DataProvider
  public static Object[][] NegativeDataProvider() {
    return new Object[][] {
            {-46, true},
            {56 ,false},
            {-4, true},
            {0, false},
    };
  }
}