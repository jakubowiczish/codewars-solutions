results = run_sql

describe :items do
  it "should return all unique clan names" do
    clan_names = []
    results.each do |result|
      expect(clan_names).to satisfy { |value| value != result[:clan] }
      clan_names.push(result[:clan])
    end
  end


  it "should order by total_points descending" do
    last_highest = Float::INFINITY
    results.each do |result|
      expect(result[:total_points]).to be <= last_highest
      last_highest = result[:total_points]
    end
  end

  it "ranking should be in ascending order" do
    last_highest = 0
    results.each do |result|
      expect(result[:rank]).to be >= last_highest
      last_highest = result[:rank]
    end
  end

  it "sum of total people should equal 100" do
    sum_of_total_people = 0
    results.each do |result|
      sum_of_total_people += result[:total_people]
    end
    expect(sum_of_total_people).to eq 100
  end
end