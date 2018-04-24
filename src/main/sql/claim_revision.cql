CREATE TABLE claim_revision (
  id                        INT PRIMARY KEY,
  claim_master_id           INT,
  title                     TEXT,
  full_name                 TEXT,
  date_of_birth             timestamp,
  sex                       TEXT,
  date_of_claim             timestamp,
  partner_nino              TEXT,
  partner_title             TEXT,
  partner_full_name         TEXT,
  date_of_death             timestamp,
  married_at_date_of_death  BOOLEAN,
  dependent_children        BOOLEAN,
  pregnant_at_date_of_death BOOLEAN,
  account_type              TEXT,
  name_on_account           TEXT,
  sort_code                 VARCHAR,
  account_number            VARCHAR,
  roll_number               TEXT,
  reason_for_disallowance   TEXT,
  created                   TIMESTAMP
);

INSERT INTO claim_revision (id, claim_master_id, title, full_name) VALUES (1, 1, 'Mr', 'Hawk Eye');