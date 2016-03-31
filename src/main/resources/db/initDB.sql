DROP TABLE order_item;
DROP TABLE item;
DROP TABLE shop_order;
DROP TABLE item_category;
DROP TABLE vendor;
DROP TABLE country;
DROP TABLE user;


CREATE TABLE item_category (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC));

CREATE TABLE country (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC));

CREATE TABLE vendor (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC),
  CONSTRAINT `fk_vendor_country`
  FOREIGN KEY (`country_id`)
  REFERENCES country (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE item (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(120) NOT NULL,
  `description` VARCHAR(3000) NULL,
  `item_category_id` INT NOT NULL,
  `image` VARCHAR(45) NULL DEFAULT 'no_image.png',
  `vendor_id` INT NOT NULL,
  `price` FLOAT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_item_vendor_idx` (`vendor_id` ASC),
  INDEX `fk_item_item_cat_idx` (`item_category_id` ASC),
  CONSTRAINT `fk_item_item_cat`
  FOREIGN KEY (`item_category_id`)
  REFERENCES item_category (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_vendor`
  FOREIGN KEY (`vendor_id`)
  REFERENCES vendor (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE user (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(128) NOT NULL,
  `email` VARCHAR(128) NOT NULL,
  `phone` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC));

CREATE TABLE shop_order (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NULL,
  `address` VARCHAR(2048) NOT NULL,
  `phone` BIGINT NOT NULL,
  `commentary` VARCHAR(4096) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE order_item (
  `order_id` INT NOT NULL,
  `item_id` INT NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`order_id`, `item_id`));
