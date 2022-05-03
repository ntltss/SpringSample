package com.example.SampleJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    EmployeeRepository empRepository;

    /**
     * 全ての従業員リストを返す
     * @return 全従業員の情報
     */
    public List<Employee> findAll(){
        return empRepository.findAll();
    }

    /**
     * 引数に指定したIDの従業員エンティティを返す。
     * @param empno 従業員ID
     * @return 検索結果の従業員情報
     */
    public Optional<Employee> findOne(@PathVariable("empno") long empno){
        return empRepository.findById(empno);
    }

    /**
     * 引数に指定した従業員エンティティを保存
     * @param employee 従業員情報
     */
    public void save(Employee employee){
        empRepository.save(employee);
    }

    /**
     * 引数に指定した従業員エンティティを削除
     * @param employee 従業員情報
     */
    public void delete(Employee employee){
        empRepository.delete(employee);
    }
}
