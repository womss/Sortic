import React,{ useEffect } from "react";
import { useState } from "react";
import { useAtom } from 'jotai';
import { Input, Modal, message } from 'antd';
import axios from 'axios';

import {
    fetchAndNumberBillsAction,
    input1Atom, input2Atom, sumAtom
} from '../actions/billActions'





const BillPage = () => {
    const [,setfetchAndNumberBills] = useAtom(fetchAndNumberBillsAction);
    useEffect(()=>{
    setfetchAndNumberBills()
    },[]);


    return (
        <div>
            <div>

            </div>


        </div>
    );
};
export default BillPage;
