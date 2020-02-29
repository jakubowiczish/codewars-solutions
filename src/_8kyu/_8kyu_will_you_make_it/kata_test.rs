#[cfg(test)]
mod tests {
    use super::zero_fuel;

    #[test]
    fn sample_tests() {
      assert_eq!(zero_fuel(50, 25, 2), true);
      assert_eq!(zero_fuel(100, 50, 1), false);
    }
}