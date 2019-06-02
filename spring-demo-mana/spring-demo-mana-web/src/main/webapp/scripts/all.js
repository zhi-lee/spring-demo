define('all', ['jquery','layui'], function ($) {
    $.namespace('mana.client');
    mana.client = function () {
        var type = 'post', dataType = 'json', page, pageSize, loading;
        return {
            handle: function (setting) {
                $.ajax({
                    url: setting.url,
                    type: type,
                    data: $.extend({}, setting.data),
                    async: setting.async || false,
                    beforeSend: function () {
                        loading = layer.load(2, {time: 2000});
                        setting.beforeSend ? setting.beforeSend() : function () {
                            console.log('beforeSend...');
                            layer.alert('msg')
                        }();
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        layer.close(loading);
                        layer.msg('系统异常，请联系管理员');
                    }, success: function (data, textStatus, jqXHR) {
                        layer.close(loading);
                        console.log(data);
                        setting.success ? setting.success() : function () {
                            console.log('success...')
                        }();
                    }
                })
            },
        }
    }();

    $.namespace('mana.validation');
    mana.validation = function () {
        return {
            validator: function () {

            }
        }
    }();

    $.namespace('mana.navbar');
    mana.navbar = function () {
        return {
            init: function () {
            }
        }
    }();

    $.namespace('mana.')
    return {
        init: function () {
            return mana.client.handle({
                url: '/req',async:true, data: {name: 'lizhi'}
                , success: function () {
                    console.log('lizhi sccuess');
                }, beforeSend: function () {
                    console.log('xxxx');
                }
            })
        }
    }
});