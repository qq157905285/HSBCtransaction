package com.sqzer.hsbctransaction.service;

import com.sqzer.hsbctransaction.model.Transaction;
import java.util.List;
import java.util.Optional;

public interface TransactionService {

    /**
     * 分页查询交易记录，可选按类型筛选
     * @param page 页码（从0开始）
     * @param size 每页大小
     * @param type 可选交易类型筛选
     * @return 分页后的交易记录列表
     */
    List<Transaction> findPaginated(int page, int size, Transaction.TransactionType type);

    /**
     * 创建一条交易记录
     * @param tx 交易对象
     * @return 创建后的交易对象
     */
    Transaction create(Transaction tx);

    /**
     * 根据ID获取交易
     * @param id 交易ID
     * @return 交易对象（Optional）
     */
    Optional<Transaction> get(String id);

    /**
     * 更新指定ID的交易信息
     * @param id 要更新的交易ID
     * @param updated 更新后的对象
     * @return 更新后的对象（Optional）
     */
    Optional<Transaction> update(String id, Transaction updated);

    /**
     * 删除指定ID的交易记录
     * @param id 交易ID
     * @return 删除是否成功
     */
    boolean delete(String id);
}