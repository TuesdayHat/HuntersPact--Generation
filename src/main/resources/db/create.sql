SET MODE PostgreSQL

CREATE IF NOT EXISTS regions (
    id int PRIMARY KEY auto_increment,
)

CREATE IF NOT EXISTS areas(
    id int PRIMARY KEY auto_increment,
)

CREATE IF NOT EXISTS locations(
    id int PRIMARY KEY auto_increment,
)

CREATE IF NOT EXISTS regions_areas(
    id int PRIMARY KEY auto_increment,
    regionid INTEGER,
    areaid INTEGER
)