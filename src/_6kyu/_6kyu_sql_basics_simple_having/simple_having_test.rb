# DATA FOR TESTS IS AVAILABLE ONLY ON WEBSITE

compare_with expected do
  spec do
    it "should contain HAVING" do
      expect($sql.upcase).to include("HAVING")
    end

    it "should contain GROUP BY" do
      expect($sql.upcase).to include("GROUP BY")
    end

    it "should contain not WHERE" do
      expect($sql.upcase).not_to include("WHERE")
    end
  end
end