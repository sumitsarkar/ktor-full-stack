CREATE TYPE monitor_type as ENUM ('HTTP');

CREATE TABLE monitor_types
(
    id       BIGSERIAL PRIMARY KEY,
    type     monitor_type    NOT NULL
);


CREATE TABLE monitor
(
    id       BIGSERIAL PRIMARY KEY,
    name     TEXT NOT NULL,
    endpoint TEXT NOT NULL,
    monitor_type BIGINT REFERENCES monitor_types(id),
    created_at TIMESTAMPTZ,
    modified_at TIMESTAMPTZ,
    created_by TEXT,
    modified_by TEXT
);

