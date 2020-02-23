package io.github.byference.admin.modules.system.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.github.byference.admin.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MockController
 *
 * @author byference
 * @since 2019-12-07
 */
@RestController
public class MockController {


    @GetMapping("/sysUser/info")
    public Result<JSONObject> info() {

        // UserInfo.json
        String roleStr = getInfoStr();
        final JSONObject userInfo = JSON.parseObject(roleStr);
        return Result.ok(userInfo);
    }


    @GetMapping("/role")
    public Result<JSONObject> role() {

        // role.json
        String roleStr = getRoleStr();
        final JSONObject userInfo = JSON.parseObject(roleStr);
        return Result.ok(new JSONObject());
    }











    // **********************   待修改   **********************







    @GetMapping("/workplace/radar")
    public Result<JSONArray> radar() {

        String roleStr = getRadarStr();
        final JSONArray userInfo = JSON.parseArray(roleStr);
        return Result.ok(userInfo);
    }

    @GetMapping("/workplace/teams")
    public Result<JSONArray> teams() {

        String roleStr = getTeamsStr();
        final JSONArray userInfo = JSON.parseArray(roleStr);
        return Result.ok(userInfo);
    }

    @GetMapping("/workplace/activity")
    public Result<JSONArray> activity() {

        String roleStr = getActivityStr();
        final JSONArray userInfo = JSON.parseArray(roleStr);
        return Result.ok(userInfo);
    }

    @GetMapping("/list/search/projects")
    public Result<JSONObject> projects() {

        String roleStr = getProjectsStr();
        final JSONObject userInfo = JSON.parseObject(roleStr);
        return Result.ok(userInfo);
    }

    @GetMapping("/service")
    public Result<JSONObject> service() {

        String roleStr = getServiceStr();
        final JSONObject userInfo = JSON.parseObject(roleStr);
        return Result.ok(userInfo);
    }

    private String getRoleStr() {
        return "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"admin\",\n" +
                "      \"name\": \"管理员\",\n" +
                "      \"describe\": \"拥有所有权限\",\n" +
                "      \"status\": 1,\n" +
                "      \"creatorId\": \"system\",\n" +
                "      \"createTime\": 1497160610259,\n" +
                "      \"deleted\": 0,\n" +
                "      \"permissions\": [\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"comment\",\n" +
                "          \"permissionName\": \"评论管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"member\",\n" +
                "          \"permissionName\": \"会员管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"menu\",\n" +
                "          \"permissionName\": \"菜单管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导入\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"describe\": \"导入\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"order\",\n" +
                "          \"permissionName\": \"订单管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"permission\",\n" +
                "          \"permissionName\": \"权限管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"role\",\n" +
                "          \"permissionName\": \"角色管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"test\",\n" +
                "          \"permissionName\": \"测试权限\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"user\",\n" +
                "          \"permissionName\": \"用户管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导入\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"export\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导出\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"describe\": \"导入\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"export\",\n" +
                "              \"describe\": \"导出\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"svip\",\n" +
                "      \"name\": \"SVIP\",\n" +
                "      \"describe\": \"超级会员\",\n" +
                "      \"status\": 1,\n" +
                "      \"creatorId\": \"system\",\n" +
                "      \"createTime\": 1532417744846,\n" +
                "      \"deleted\": 0,\n" +
                "      \"permissions\": [\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"comment\",\n" +
                "          \"permissionName\": \"评论管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"member\",\n" +
                "          \"permissionName\": \"会员管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"menu\",\n" +
                "          \"permissionName\": \"菜单管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导入\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"describe\": \"导入\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"order\",\n" +
                "          \"permissionName\": \"订单管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"permission\",\n" +
                "          \"permissionName\": \"权限管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"role\",\n" +
                "          \"permissionName\": \"角色管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"describe\": \"删除\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"test\",\n" +
                "          \"permissionName\": \"测试权限\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"admin\",\n" +
                "          \"permissionId\": \"user\",\n" +
                "          \"permissionName\": \"用户管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"新增\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导入\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"修改\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"delete\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"删除\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"export\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"导出\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"add\",\n" +
                "              \"describe\": \"新增\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"import\",\n" +
                "              \"describe\": \"导入\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"update\",\n" +
                "              \"describe\": \"修改\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"user\",\n" +
                "      \"name\": \"普通会员\",\n" +
                "      \"describe\": \"普通用户，只能查询\",\n" +
                "      \"status\": 1,\n" +
                "      \"creatorId\": \"system\",\n" +
                "      \"createTime\": 1497160610259,\n" +
                "      \"deleted\": 0,\n" +
                "      \"permissions\": [\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"comment\",\n" +
                "          \"permissionName\": \"评论管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"marketing\",\n" +
                "          \"permissionName\": \"营销管理\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"member\",\n" +
                "          \"permissionName\": \"会员管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"menu\",\n" +
                "          \"permissionName\": \"菜单管理\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"order\",\n" +
                "          \"permissionName\": \"订单管理\",\n" +
                "          \"actions\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"查询\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"defaultCheck\": false,\n" +
                "              \"describe\": \"详情\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "            {\n" +
                "              \"action\": \"query\",\n" +
                "              \"describe\": \"查询\",\n" +
                "              \"defaultCheck\": false\n" +
                "            },\n" +
                "            {\n" +
                "              \"action\": \"get\",\n" +
                "              \"describe\": \"详情\",\n" +
                "              \"defaultCheck\": false\n" +
                "            }\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"permission\",\n" +
                "          \"permissionName\": \"权限管理\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"role\",\n" +
                "          \"permissionName\": \"角色管理\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"test\",\n" +
                "          \"permissionName\": \"测试权限\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        },\n" +
                "        {\n" +
                "          \"roleId\": \"user\",\n" +
                "          \"permissionId\": \"user\",\n" +
                "          \"permissionName\": \"用户管理\",\n" +
                "          \"actions\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionEntitySet\": [\n" +
                "\n" +
                "          ],\n" +
                "          \"actionList\": null,\n" +
                "          \"dataAccess\": null\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"pageSize\": 10,\n" +
                "  \"pageNo\": 0,\n" +
                "  \"totalPage\": 1,\n" +
                "  \"totalCount\": 5\n" +
                "}";
    }

    private String getServiceStr() {
        return "{\n" +
                "    \"pageSize\": 1,\n" +
                "    \"pageNo\": 10,\n" +
                "    \"totalCount\": 200,\n" +
                "    \"totalPage\": 20,\n" +
                "    \"data\": {\n" +
                "        \"key\": 2,\n" +
                "        \"id\": 2,\n" +
                "        \"no\": \"No 2\",\n" +
                "        \"description\": \"这是一段描述\",\n" +
                "        \"callNo\": 35,\n" +
                "        \"status\": 2,\n" +
                "        \"updatedAt\": \"2020-11-11\",\n" +
                "        \"editable\": false\n" +
                "    }\n" +
                "}";
    }

    private String getProjectsStr() {

        return "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/WdGqmHpayyMjiEhcKoVE.png\",\n" +
                "            \"title\": \"Alipay\",\n" +
                "            \"description\": \"那是一种内在的东西， 他们到达不了，也无法触及的\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/zOsKZmFRdUtvpqCImOVY.png\",\n" +
                "            \"title\": \"Angular\",\n" +
                "            \"description\": \"希望是一个好东西，也许是最好的，好东西是不会消亡的\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/dURIMkkrRFpPgTuzkwnB.png\",\n" +
                "            \"title\": \"Ant Design\",\n" +
                "            \"description\": \"城镇中有那么多的酒馆，她却偏偏走进了我的酒馆\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 4,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/sfjbOqnsXXJgNCjCzDBL.png\",\n" +
                "            \"title\": \"Ant Design Pro\",\n" +
                "            \"description\": \"那时候我只会想自己想要什么，从不想自己拥有什么\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 5,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/siCrBXXhmvTQGWPNLBow.png\",\n" +
                "            \"title\": \"Bootstrap\",\n" +
                "            \"description\": \"凛冬将至\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 6,\n" +
                "            \"cover\": \"https://gw.alipayobjects.com/zos/rmsportal/ComBAopevLwENQdKWiIn.png\",\n" +
                "            \"title\": \"Vue\",\n" +
                "            \"description\": \"生命就像一盒巧克力，结果往往出人意料\",\n" +
                "            \"status\": 1,\n" +
                "            \"updatedAt\": \"2018-07-26 00:00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"pageSize\": 10,\n" +
                "    \"pageNo\": 0,\n" +
                "    \"totalPage\": 6,\n" +
                "    \"totalCount\": 57\n" +
                "}";
    }


    private String getActivityStr() {

        return "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"@name\",\n" +
                "            \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"白鹭酱油开发组\",\n" +
                "            \"action\": \"更新\",\n" +
                "            \"event\": \"番组计划\"\n" +
                "        },\n" +
                "        \"time\": \"2018-08-23 14:47:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"蓝莓酱\",\n" +
                "            \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/jZUIxmJycoymBprLOUbT.png\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"白鹭酱油开发组\",\n" +
                "            \"action\": \"更新\",\n" +
                "            \"event\": \"番组计划\"\n" +
                "        },\n" +
                "        \"time\": \"2018-08-23 09:35:37\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"@name\",\n" +
                "            \"avatar\": \"@image(64x64)\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"白鹭酱油开发组\",\n" +
                "            \"action\": \"创建\",\n" +
                "            \"event\": \"番组计划\"\n" +
                "        },\n" +
                "        \"time\": \"2017-05-27 00:00:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"曲丽丽\",\n" +
                "            \"avatar\": \"@image(64x64)\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"高逼格设计天团\",\n" +
                "            \"action\": \"更新\",\n" +
                "            \"event\": \"六月迭代\"\n" +
                "        },\n" +
                "        \"time\": \"2018-08-23 14:47:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"@name\",\n" +
                "            \"avatar\": \"@image(64x64)\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"高逼格设计天团\",\n" +
                "            \"action\": \"created\",\n" +
                "            \"event\": \"六月迭代\"\n" +
                "        },\n" +
                "        \"time\": \"2018-08-23 14:47:00\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"user\": {\n" +
                "            \"nickname\": \"曲丽丽\",\n" +
                "            \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png\"\n" +
                "        },\n" +
                "        \"project\": {\n" +
                "            \"name\": \"高逼格设计天团\",\n" +
                "            \"action\": \"created\",\n" +
                "            \"event\": \"六月迭代\"\n" +
                "        },\n" +
                "        \"time\": \"2018-08-23 14:47:00\"\n" +
                "    }\n" +
                "]";
    }


    private String getTeamsStr() {
        return "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"科学搬砖组\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/BiazfanxmamNRoxxVxka.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"程序员日常\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/cnrhVkzwxjPwAaCfPbdc.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"设计天团\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/gaOngJwsRYRaVAuXXcmB.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"中二少女团\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/ubnKSIfAJTxIgXOKlciN.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"骗你学计算机\",\n" +
                "        \"avatar\": \"https://gw.alipayobjects.com/zos/rmsportal/WhxKECPNujWoWEFNdnJE.png\"\n" +
                "    }\n" +
                "]";
    }

    private String getRadarStr() {
        return "[\n" +
                "    {\n" +
                "        \"item\": \"引用\",\n" +
                "        \"个人\": 70,\n" +
                "        \"团队\": 30,\n" +
                "        \"部门\": 40\n" +
                "    },\n" +
                "    {\n" +
                "        \"item\": \"口碑\",\n" +
                "        \"个人\": 60,\n" +
                "        \"团队\": 70,\n" +
                "        \"部门\": 40\n" +
                "    },\n" +
                "    {\n" +
                "        \"item\": \"产量\",\n" +
                "        \"个人\": 50,\n" +
                "        \"团队\": 60,\n" +
                "        \"部门\": 40\n" +
                "    },\n" +
                "    {\n" +
                "        \"item\": \"贡献\",\n" +
                "        \"个人\": 40,\n" +
                "        \"团队\": 50,\n" +
                "        \"部门\": 40\n" +
                "    },\n" +
                "    {\n" +
                "        \"item\": \"热度\",\n" +
                "        \"个人\": 60,\n" +
                "        \"团队\": 70,\n" +
                "        \"部门\": 40\n" +
                "    },\n" +
                "    {\n" +
                "        \"item\": \"引用\",\n" +
                "        \"个人\": 70,\n" +
                "        \"团队\": 50,\n" +
                "        \"部门\": 40\n" +
                "    }\n" +
                "]";
    }

    private String getInfoStr() {
        return "{\n" +
                "  \"id\": \"4291d7da9005377ec9aec4a71ea837f\",\n" +
                "  \"name\": \"天野远子\",\n" +
                "  \"username\": \"admin\",\n" +
                "  \"password\": \"\",\n" +
                "  \"avatar\": \"/avatar2.jpg\",\n" +
                "  \"status\": 1,\n" +
                "  \"telephone\": \"\",\n" +
                "  \"lastLoginIp\": \"27.154.74.117\",\n" +
                "  \"lastLoginTime\": 1534837621348,\n" +
                "  \"creatorId\": \"admin\",\n" +
                "  \"createTime\": 1497160610259,\n" +
                "  \"merchantCode\": \"TLif2btpzg079h15bk\",\n" +
                "  \"deleted\": 0,\n" +
                "  \"roleId\": \"admin\",\n" +
                "  \"role\": {\n" +
                "    \"id\": \"admin\",\n" +
                "    \"name\": \"管理员\",\n" +
                "    \"describe\": \"拥有所有权限\",\n" +
                "    \"status\": 1,\n" +
                "    \"creatorId\": \"system\",\n" +
                "    \"createTime\": 1497160610259,\n" +
                "    \"deleted\": 0,\n" +
                "    \"permissions\": [\n" +
                "      {\n" +
                "        \"roleId\": \"admin\",\n" +
                "        \"permissionId\": \"dashboard\",\n" +
                "        \"permissionName\": \"仪表盘\",\n" +
                "        \"actions\": [],\n" +
                "        \"actionEntitySet\": [],\n" +
                "        \"actionList\": null,\n" +
                "        \"dataAccess\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }


}
