[RESTful API]示例
【GET】          /users                 # 查询用户信息列表
【GET】          /users/1001            # 查看某个用户信息
【POST】         /users                 # 新建用户信息
【PUT】          /users/1001            # 更新用户信息(全部字段)
【PATCH】        /users/1001            # 更新用户信息(部分字段)
【DELETE】       /users/1001            # 删除用户信息

实质
    1、Web API服务只是使用HTTP作为传输方式
    2、Web API引入资源的概念，每个资源有对应的标识符和表达
    3、Web API服务使用不通的HTTP方式来进行不通的操作，并且使用HTTP状态码来表示不通的结果
    4、Web API服务使用HATEOAS。在资源的表达中包含了链接信息


兼容
    【GET】  /v1/users/{user_id}  // 版本 v1 的查询用户列表的 API 接口
    【GET】  /v2/users/{user_id}  // 版本 v2 的查询用户列表的 API 接口


以抽象的方式屏蔽业务实现


考虑背后的性能


异常响应与错误机制
    HTTP/1.1 400 Bad Request
    Content-Type: application/json
    {
       "code": "INVALID_ARGUMENT",
       "message": "{error message}",
       "cause": "{cause message}",
       "request_id": "01234567-89ab-cdef-0123-456789abcdef",
       "host_id": "{server identity}",
       "server_time": "2014-01-01T12:00:00Z"
    }


思考 API 的幂等性


# GET：读取（Read acquire(acq) obtain
# POST：新建（Create）increase(incre) raise
# PUT：更新（Update）transform(tran) change
# PATCH：更新（Update），通常是部分更新
# DELETE：删除（Delete）delete(del) delete