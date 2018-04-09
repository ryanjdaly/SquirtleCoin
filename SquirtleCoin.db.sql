BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `Players` (
	`PlayerID`	INTEGER NOT NULL UNIQUE,
	`Username`	TEXT NOT NULL,
	`Password`	TEXT NOT NULL,
	`TopScore`	INTEGER,
	`TotalPlaytime`	INTEGER,
	PRIMARY KEY(`PlayerID`)
);
INSERT INTO `Players` VALUES (1,'chiefjosh','cj98',NULL,NULL);
INSERT INTO `Players` VALUES (2,'DyingSquirtle','WILD',2000,5329);
INSERT INTO `Players` VALUES (3,'LeeroyJenkins','chicken',5,1269);
INSERT INTO `Players` VALUES (4,'UndesirableHam','password',1757,3542);
INSERT INTO `Players` VALUES (5,'MojoBrojo','drowssap',1,55555);
CREATE TABLE IF NOT EXISTS `PlayedSeeds` (
	`PlayerID`	INTEGER,
	`Seed`	INTEGER
);
COMMIT;
