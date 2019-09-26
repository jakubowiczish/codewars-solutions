describe 'Dividing numbers:' do
  Test.expect defined?(divide_numbers), 'divide_numbers is not defined'
  Test.assert_equals divide_numbers(4, 2), 2, '4 / 2'
  Test.assert_equals divide_numbers(10, 2), 5, '10 / 2'
  Test.assert_equals divide_numbers(9, 4), 2.25, '9 / 4'
  Test.assert_equals divide_numbers(21, 5), 4.2, '21 / 5'
  Test.assert_equals divide_numbers(9, 3), 3, '9 / 3'
  Test.assert_equals divide_numbers(1, 100), 0.01, '1 / 100'
end