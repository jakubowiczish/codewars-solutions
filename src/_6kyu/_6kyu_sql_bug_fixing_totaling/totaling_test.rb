# DATA FOR TESTS IS AVAILABLE ONLY ON WEBSITE

compare_with expected do
    draw_chart(
      type: :timeseries,
      group_by: :department,
      x: :day,
      y: :sale_count,
      sort: false
    )
end