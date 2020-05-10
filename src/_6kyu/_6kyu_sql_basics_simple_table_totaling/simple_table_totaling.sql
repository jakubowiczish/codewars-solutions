SELECT
            RANK() OVER (ORDER BY SUM(points) DESC) AS rank,
            COALESCE(NULLIF(clan, ''), '[no clan specified]') AS clan,
            SUM(points) as total_points,
            COUNT(name) as total_people
FROM people
GROUP BY clan;