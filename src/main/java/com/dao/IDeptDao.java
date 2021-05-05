package com.dao;

public interface IDeptDao {
//    // 根据部门编号查询部门：没有查询所属的员工信息
//    public User queryById(int deptno);
//    //根据部门编号查询部门：有查询所属的员工信息
//    public User queryById110(int deptno);
//
//    //根据部门编号查询此部门中的员工集合
//    public List<Emp> queryByIds120(int deptno);
//
//    public List<Emp> queryAllEmpAndDemp();
//
//    //查询所有部门
//    public List<Dept> queryAll();
//    // 删除部门
//    public int deleteById(int deptno);
//
//    // 新增部门：客户端的参数可以是对象
//    public int insertDept(Dept dept);
//
//    // 根据部门编号修改部门名称
//    public int updateById(Map<Object, Object> map);
//
//    //根据名称查询部门 )
//    public List<Dept> findByName(String dname);
//
//    //表名动态化：根据表名查询
//    List<Dept> findByTableName(String dept);
//
//    // 根据部门的编号来查出此部门领导的所有员工
//    public List<Emp> queryByIds2(int deptno);

    public void getUser();

}
