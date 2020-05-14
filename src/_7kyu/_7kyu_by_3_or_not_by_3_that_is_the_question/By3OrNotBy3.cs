using System;

public static class By3OrNotBy3
{
  public static bool DivisibleByThree(string n)
  {
    int sum = 0;
    for (int i = 0; i < n.Length; ++i) {
        sum += n[i] - '0';
    }

    return sum % 3 == 0;
  }
}