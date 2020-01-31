Adding data for account details and transaction details:
-------------------------------------------------------

Account Details table scripts:
------------------------------

insert into ACCOUNT_DETAILS VALUES(585309209, 'SGSavings726', 'Savings', '2020-01-28', 'SGD', 84500.00);
insert into ACCOUNT_DETAILS VALUES(791066619, 'AUSavings933', 'Savings', '2020-01-28', 'AUD', 86000.00);
insert into ACCOUNT_DETAILS VALUES(321145678, 'AUCurrent433', 'Current', '2020-01-28', 'SGD', 76000.00);
insert into ACCOUNT_DETAILS VALUES(320045699, 'SGSavings842', 'Savings', '2020-01-28', 'AUD', 86000.00);

Transaction Details table Scripts:
----------------------------------
insert into transaction_details values(1, 'CurrentAccount', 1232223212,1000, 'credit','SGD',0,'null','2012-01-12');
insert into transaction_details values(2, 'CurrentAccount', 1232223212,5000, 'credit','SGD',0,'null','2012-01-12');
insert into transaction_details values(3, 'CurrentAccount', 1232223212,2000, 'credit','SGD',0,'null','2012-01-12');
insert into transaction_details values(4, 'AUSavings933', 585309209,1000, 'credit','SGD',0,'null','2012-08-28');
insert into transaction_details values(5, 'AUSavings933', 585309209,4000, 'credit','SGD',0,'null','2012-08-28');
insert into transaction_details values(6, 'AUSavings933', 585309209,9000, 'credit','SGD',0,'null','2012-08-28');
insert into transaction_details values(7, 'AUCurrent', 321145678,8000, 'credit','SGD',0,'null','2012-08-28');
insert into transaction_details values(8, 'AUCurrent', 321145678,9000, 'credit','SGD',0,'null','2012-08-28');
