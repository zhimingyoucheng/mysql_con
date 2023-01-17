CREATE TABLE `user` (
                           `id` int NOT NULL,
                           `name` varchar(32) DEFAULT NULL,
                           `age` int DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `rmg` (
                        `cst_id` varchar(18) not null ,
                        `cust_name` varchar(180) not null ,
                        `cert_type` varchar(4) not null ,
                        `cert_no` varchar(120) not null ,
                        PRIMARY KEY (`cst_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
