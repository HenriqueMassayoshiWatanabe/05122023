import java.sql.*;

public class CreateTableAllTypesCRUD {
    public static void main(String[] args) {
        String status = "Nada aconteceu";
        try {
            Connection conn = MySQLConnector.conectar();
            String strSqlCreate = "CREATE TABLE `teste`.`tbl_tipos_dados` (`id` INT NOT NULL AUTO_INCREMENT , `varchar` VARCHAR(255) NULL , `text` TEXT NULL , `date` DATE NULL , `tinyint` TINYINT NULL , `smallint` SMALLINT NULL , `mediumint` MEDIUMINT NULL , `bigint` BIGINT NULL , `decimal` DECIMAL NULL , `float` FLOAT NULL , `double` DOUBLE NULL , `real` REAL NULL , `bit` BIT NULL , `boolean` BOOLEAN NULL , `serial` SERIAL NULL , `datetime` DATETIME NULL , `timestamp` TIMESTAMP NULL , `time` TIME NULL , `year` YEAR NULL , `char` CHAR NULL , `tinytext` TINYTEXT NULL , `mediumtext` MEDIUMTEXT NULL , `longtext` LONGTEXT NULL , `binary` BINARY BINARY NULL , `varbinary` VARBINARY BINARY NULL , `tinyblob` TINYBLOB NULL , `blob` BLOB NULL , `mediumblob` MEDIUMBLOB NULL , `longblob` LONGBLOB NULL , `enum` ENUM NULL , `set` SET NULL , `geometry` GEOMETRY NULL , `point` POINT NULL , `linestring` LINESTRING NULL , `polygon` POLYGON NULL , `multipoint` MULTIPOINT NULL , `multilinestring` MULTILINESTRING NULL , `multipolygon` MULTIPOLYGON NULL , `geometrycollection` GEOMETRYCOLLECTION NULL , `json` JSON NULL , PRIMARY KEY (`id`));";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            stmSql.addBatch(strSqlCreate);
            stmSql.executeBatch();
            status = "Ok! Tabela criada.";
            stmSql.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (Exception e) {
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
    }
}
