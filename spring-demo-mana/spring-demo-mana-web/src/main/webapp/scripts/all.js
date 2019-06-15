define('all', ['jquery', 'jquery.validate', 'layui'], function ($, validate) {
    "use strict";
    $.namespace('mana.client');
    mana.client = (() => {
        return {
            ajax: (setting) => {
                var loading, v5 = {
                    type: 'post',
                    dataType: 'json',
                    data: {},
                    async: true,
                    headers: {sign:localStorage.getItem('sign')},
                    beforeAjax: () => false,
                    beforeSend: () => false,
                    success: (data, textStatus, jqXHR) => console.log(data),
                    error: (jqXHR, textStatus, errorThrown) => console.log(textStatus)
                };
                $.extend(v5, setting);
                if (v5.beforeAjax())
                    return false;
                $.ajax($.extend({}, v5, {
                    beforeSend: () => {
                        loading = layer.load(2, {time: 5000}, v5.beforeSend())
                    },
                    success: (data, textStatus, jqXHR) => {
                        layer.close(loading), console.log(data);
                        v5.success(data, textStatus, jqXHR);
                    },
                    error: (jqXHR, textStatus, errorThrown) => {
                        layer.close(loading), layer.msg('系统异常，请联系管理员');
                    }

                }));
            },
            validate:()=>{}
        }
    })();

    return () => {
        return mana.client.ajax({
            url: '/req', async: true, data: {name: 'lizhi'}
            , success: function () {
                console.log('lizhi sccuess');
            }, beforeSend: function () {
                console.log('xxxx');
            }
        })
    }

});