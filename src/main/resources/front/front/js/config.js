
var projectName = '校园台球厅人员与设备管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '球桌信息',
	url: './pages/qiuzhuoxinxi/list.html'
}, 

{
	name: '公告信息',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboott50fc/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"会员账户","menuJump":"列表","tableName":"huiyuanzhanghu"}],"menu":"会员账户管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","删除"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除","查看评论","报表"],"menu":"球桌信息","menuJump":"列表","tableName":"qiuzhuoxinxi"}],"menu":"球桌信息管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除"],"menu":"普通预约","menuJump":"列表","tableName":"putongyuyue"}],"menu":"普通预约管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"留言反馈","tableName":"messages"}],"menu":"留言反馈"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","会员预约","普通预约"],"menu":"球桌信息列表","menuJump":"列表","tableName":"qiuzhuoxinxi"}],"menu":"球桌信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","会员充值"],"menu":"会员账户","menuJump":"列表","tableName":"huiyuanzhanghu"}],"menu":"会员账户管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","支付"],"menu":"会员充值","menuJump":"列表","tableName":"huiyuanchongzhi"}],"menu":"会员充值管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看"],"menu":"会员预约","menuJump":"列表","tableName":"huiyuanyuyue"}],"menu":"会员预约管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","支付"],"menu":"普通预约","menuJump":"列表","tableName":"putongyuyue"}],"menu":"普通预约管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","删除"],"menu":"留言反馈","tableName":"messages"}],"menu":"留言反馈"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","会员预约","普通预约"],"menu":"球桌信息列表","menuJump":"列表","tableName":"qiuzhuoxinxi"}],"menu":"球桌信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
