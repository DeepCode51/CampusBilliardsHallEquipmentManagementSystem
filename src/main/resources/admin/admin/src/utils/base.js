const base = {
    get() {
        return {
            url : "http://localhost:8080/springboott50fc/",
            name: "springboott50fc",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboott50fc/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园台球厅人员与设备管理系统"
        } 
    }
}
export default base
