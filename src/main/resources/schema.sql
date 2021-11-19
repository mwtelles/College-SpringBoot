CREATE TABLE installments (
     id INT NOT NULL,
     count INT NOT NULL,
     value FLOAT
);

CREATE TABLE product (
     id INT NOT NULL,
     name VARCHAR(255) NOT NULL,
     description VARCHAR(400),
     imageUrl VARCHAR(1400),
     oldPrice FLOAT,
     price FLOAT,
     installments_id INT NOT NULL
);