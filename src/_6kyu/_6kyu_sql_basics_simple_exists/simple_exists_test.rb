# DATA FOR TESTS IS AVAILABLE ONLY ON WEBSITE

results = run_sql

describe :query do
  describe "should contain keywords" do
    it "should contain EXISTS" do
      expect($sql.upcase).to include("EXISTS")
    end

    it "should contain WHERE" do
      expect($sql.upcase).to include("WHERE")
    end

    it "should not contain IN" do
      expect($sql.upcase).not_to include(" IN ")
    end
  end

  describe :columns do
    it "should return 2 columns" do
      expect(results.first.keys.count).to eq 2
    end

    it "should return an id column" do
      expect(results.first.keys).to include(:id)
    end

    it "should return a name column" do
      expect(results.first.keys).to include(:name)
    end
  end
end