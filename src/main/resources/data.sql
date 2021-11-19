INSERT INTO installments(id, count, value)
VALUES (0, 3, '115.00');

INSERT INTO installments(id, count, value)
VALUES (1, 3, '70.00');

INSERT INTO installments(id, count, value)
VALUES (2, 3, '100.00');

INSERT INTO installments(id, count, value)
VALUES (3, 2, '80.50');

INSERT INTO installments(id, count, value)
VALUES (4, 2, '90.90');


INSERT INTO product(id, name, description, imageUrl, oldPrice, price, installments_id)
VALUES (0, 'Leather Shoes Puma R698 Q4 V2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'https://imgur.com/a/i1SrNpF', '400.00', '350.00', 0);

INSERT INTO product(id, name, description, imageUrl, oldPrice, price, installments_id)
VALUES (1, 'Leather Shoes Nike R699 Q4 V2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'https://imgur.com/a/i1SrNpF', '399.00', '388.00', 1);

INSERT INTO product(id, name, description, imageUrl, oldPrice, price, installments_id)
VALUES (2, 'Leather Shoes Adidas R700 Q4 V2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'https://imgur.com/a/i1SrNpF', '379.00', '368.00', 2);

INSERT INTO product(id, name, description, imageUrl, oldPrice, price, installments_id)
VALUES (3, 'Leather Shoes Vans R701 Q4 V2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'https://imgur.com/a/i1SrNpF', '359.00', '348.00', 3);

INSERT INTO product(id, name, description, imageUrl, oldPrice, price, installments_id)
VALUES (4, 'Leather Shoes Redley R702 Q4 V2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', 'https://imgur.com/a/i1SrNpF', '339.00', '328.00', 4);