package top.shmly.enterprise.information.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private long roleId;
    /*
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(64) NOT NULL AUTO_INCREMENT,
  `username` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `password` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `role_id` bigint(64) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
INSERT INTO `user` VALUES (1, 'admin', '123456', 0);
INSERT INTO `user` VALUES (2, 'user1', 'pwd1', 0);
INSERT INTO `user` VALUES (3, 'root', '123456', 0);
*/
}
