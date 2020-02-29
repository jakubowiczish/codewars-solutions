using FactCheck

facts("zerofuel") do
  context("Sample Tests") do
    @fact zerofuel(50, 25, 2) --> true
    @fact zerofuel(100, 50, 1) --> false
  end
end