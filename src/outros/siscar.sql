-- MySQL Script generated by MySQL Workbench
-- 03/11/16 21:06:59
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema siscar
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `siscar` ;

-- -----------------------------------------------------
-- Schema siscar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `siscar` DEFAULT CHARACTER SET utf8 ;
USE `siscar` ;

-- -----------------------------------------------------
-- Table `siscar`.`aluguel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`aluguel` (
  `num_ordem` INT NOT NULL,
  PRIMARY KEY (`num_ordem`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`client` (
  `id_client` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_client`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`subsidiary`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`subsidiary` (
  `id_subsidiary` INT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_subsidiary`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`vehicle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`vehicle` (
  `id_vehicle` INT NOT NULL AUTO_INCREMENT,
  `chassi` INT NOT NULL,
  `plate` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `year` DATETIME NOT NULL,
  `id_subsidiary` INT NOT NULL,
  PRIMARY KEY (`id_vehicle`, `id_subsidiary`),
  INDEX `fk_vehicle_subsidiary1_idx` (`id_subsidiary` ASC),
  CONSTRAINT `fk_vehicle_subsidiary1`
    FOREIGN KEY (`id_subsidiary`)
    REFERENCES `siscar`.`subsidiary` (`id_subsidiary`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`employee` (
  `id_employee` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `birth_date` DATETIME NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `base_salary` INT NOT NULL,
  `workload` DATETIME NOT NULL,
  `admission_date` DATETIME NOT NULL,
  `id_subsidiary` INT NOT NULL,
  PRIMARY KEY (`id_employee`, `id_subsidiary`),
  INDEX `fk_employee_subsidiary1_idx` (`id_subsidiary` ASC),
  CONSTRAINT `fk_employee_subsidiary1`
    FOREIGN KEY (`id_subsidiary`)
    REFERENCES `siscar`.`subsidiary` (`id_subsidiary`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`salesman`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`salesman` (
  `id_salesman` INT NOT NULL AUTO_INCREMENT,
  `goal` INT NOT NULL,
  `language` VARCHAR(45) NOT NULL,
  `id_employee` INT NOT NULL,
  PRIMARY KEY (`id_salesman`, `id_employee`),
  INDEX `fk_salesman_employee1_idx` (`id_employee` ASC),
  CONSTRAINT `fk_salesman_employee1`
    FOREIGN KEY (`id_employee`)
    REFERENCES `siscar`.`employee` (`id_employee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`rent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`rent` (
  `id_rent` INT NOT NULL AUTO_INCREMENT,
  `rent_date` DATETIME NOT NULL,
  `deadline` DATETIME NOT NULL,
  `price` INT NOT NULL,
  `daily_fine` INT NOT NULL,
  `id_client` INT NOT NULL,
  `id_vehicle` INT NOT NULL,
  `id_salesman` INT NOT NULL,
  PRIMARY KEY (`id_rent`, `id_client`, `id_vehicle`, `id_salesman`),
  INDEX `fk_rent_client_idx` (`id_client` ASC),
  INDEX `fk_rent_vehicle1_idx` (`id_vehicle` ASC),
  INDEX `fk_rent_salesman1_idx` (`id_salesman` ASC),
  CONSTRAINT `fk_rent_client`
    FOREIGN KEY (`id_client`)
    REFERENCES `siscar`.`client` (`id_client`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_rent_vehicle1`
    FOREIGN KEY (`id_vehicle`)
    REFERENCES `siscar`.`vehicle` (`id_vehicle`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_rent_salesman1`
    FOREIGN KEY (`id_salesman`)
    REFERENCES `siscar`.`salesman` (`id_salesman`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`manager`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`manager` (
  `id_manager` INT NOT NULL AUTO_INCREMENT,
  `expertise` VARCHAR(45) NOT NULL,
  `id_employee` INT NOT NULL,
  PRIMARY KEY (`id_manager`, `id_employee`),
  INDEX `fk_manager_employee1_idx` (`id_employee` ASC),
  CONSTRAINT `fk_manager_employee1`
    FOREIGN KEY (`id_employee`)
    REFERENCES `siscar`.`employee` (`id_employee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `siscar`.`mit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `siscar`.`mit` (
  `id_mit` INT NOT NULL AUTO_INCREMENT,
  `expertise` VARCHAR(45) NOT NULL,
  `id_employee` INT NOT NULL,
  PRIMARY KEY (`id_mit`, `id_employee`),
  INDEX `fk_mit_employee1_idx` (`id_employee` ASC),
  CONSTRAINT `fk_mit_employee1`
    FOREIGN KEY (`id_employee`)
    REFERENCES `siscar`.`employee` (`id_employee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;