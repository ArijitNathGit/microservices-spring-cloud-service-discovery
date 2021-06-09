DROP TABLE IF EXISTS movie_info;

CREATE TABLE movie_info (
	movie_id INTEGER NOT NULL,
	movie_name VARCHAR(255),
	movie_desc VARCHAR(500),
	movie_year_release INTEGER,
	PRIMARY KEY(movie_id)
);