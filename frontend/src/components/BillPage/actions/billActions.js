import axios from 'axios';
import { atom } from 'jotai';
import { message } from 'antd';
import {billsAtom, } from "../atom/atoms";

export const fetchAndNumberBillsAction = atom (
    null,
    async(get,set)=>{
        try{
            const userid='userid123'; //실제 사용자 id로 변경 필요
            const response =await axios.post('http://localhost:8080/api/bill/get_bills',{
                params: {user_id : userid}
            });

            const bills =response.data;
            console.log('계산기 반응 ', bills)
            const numberedBills = bills.map((bill, index) => ({
                ...bill,
                number: index + 1
            }));
            set(billsAtom,numberedBills);

        }
        catch (error) {
            console.error('bill 조회 실패',error);

        }

    }
)
