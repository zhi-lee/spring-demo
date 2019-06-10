define(['layui'], function () {
    layui.config({dir: requirejs.s.contexts._.config.baseUrl + 'plugins/layui/'});
    return {layui:layui}
})