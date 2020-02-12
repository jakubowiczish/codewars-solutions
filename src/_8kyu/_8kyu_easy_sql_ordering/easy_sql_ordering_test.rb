# DATA FOR TESTS IS AVAILABLE ONLY ON WEBSITE

results = run_sql

describe :query do
  describe "should contain keywords" do
    it "should contain SELECT" do
      expect($sql.upcase).to include("SELECT")
    end

    it "should contain FROM" do
      expect($sql.upcase).to include("FROM")
    end

    it "should contain ORDER" do
      expect($sql.upcase).to include("ORDER")
    end
  end

  describe :columns do
    it "should return 4 columns" do
      expect(results.first.keys.count).to eq 4
    end

    it "should return an id column" do
      expect(results.first.keys).to include(:id)
    end

    it "should return a ceo column" do
      expect(results.first.keys).to include(:ceo)
    end

    it "should return a motto column" do
      expect(results.first.keys).to include(:motto)
    end

    it "should return an employees column" do
      expect(results.first.keys).to include(:employees)
    end
  end
end

  compare_with expected do
        end