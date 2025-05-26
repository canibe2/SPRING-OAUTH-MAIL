import { forwardRef } from 'react';
import './style.css';

interface Props {
    
}

const InputBox = forwardRef<HTMLInputElement, Props>((props:Props , ref) =>{
    return(
        <div className='input-box'>
            <div className='input-box-title'>{'아이디'}</div>
            <div className='input-box-content'>
                <div className='input-box-body'>
                <input className='input-box-input' placeholder='아이디를 입력해주세요.'/>
                <div className='input-box-button-disable'>{'중복 확인'}</div>
                </div>
                <div className='input-box-message-error'>{'사용 가능한 아이디입니다.'}</div>
            </div>
        </div>
    );
});

export default InputBox;