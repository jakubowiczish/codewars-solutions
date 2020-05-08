results = run_sql

describe :query do

    it "should contain SELECT" do
      expect($sql.upcase).to include("SELECT")
    end
  end

describe :columns do
    it "should return 1 column" do
      expect(results.first.keys.count).to eq 1
    end
    it "should contain a shortlist column" do
      expect(results.first.keys).to include(:shortlist)
    end
  end