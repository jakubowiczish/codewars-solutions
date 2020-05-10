results = run_sql

describe :query do
  describe "should contain keywords" do
    it "should contain IN" do
      expect($sql.upcase).to include("IN")
    end

    it "should contain WHERE" do
      expect($sql.upcase).to include("WHERE")
    end

    it "should not contain EXISTS" do
      expect($sql.upcase).not_to include("EXISTS")
    end

    it "should not contain JOIN" do
      expect($sql.upcase).not_to include("JOIN")
    end

    it "should not contain DISTINCT" do
      expect($sql.upcase).not_to include("DISTINCT")
    end

    it "should not contain LIMIT" do
      expect($sql.upcase).not_to include("LIMIT")
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