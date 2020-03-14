import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println(getLocalMaxs(Arrays.asList(-1, -2, -2, -1, -2, -1)).toString());
  }

  private static List getLocalMaxs(final List<Integer> inputList) {
    final List<Integer> result = new ArrayList<>();

    if (inputList.size() < 3) return result;

    for (int i = 1; i < inputList.size() - 1; i++) {
      final int prevNum = inputList.get(i-1);
      final int currentNum = inputList.get(i);
      final int nextNum = inputList.get(i+1);

      if (currentNum >= prevNum 
          && currentNum >= nextNum) result.add(currentNum);
    }

    return result;
  }
}

/*
maxima(List()) === List()
maxima(List(1)) === List()
maxima(List(1, 2)) === List()
maxima(List(2, 2)) === List()
maxima(List(1, 2, 1)) === List(2)
maxima(List(1, 2, 1, 10, 8)) === List(2, 10)
maxima(List(-2, -1, -2, -3)) === List(-1)
maxima(List(0, 0, 0, 0)) === List(0, 0)
maxima(List(1, 2, 2, 1, 2, 1)) === List(2, 2, 2)
maxima(List(-1, -2, -2, -1, -2, -1)) === List(-1)
*/
