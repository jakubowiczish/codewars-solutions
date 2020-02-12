# DATA FOR TESTS IS AVAILABLE ONLY ON WEBSITE

compare_with expected, show_daff_table: true do
  column(:day) do
    it "should start at the begining of the day" do
      expect(actual.first[:day]).to eq expected.first[:day].beginning_of_day
    end
  end

  rows do
    it "should be sorted from earliest to latest" do
      expect(actual.first[:day]).to be < actual.last[:day]
    end
  end
end