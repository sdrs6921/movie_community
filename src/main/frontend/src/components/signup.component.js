import React, { Component } from "react";

export default class SignUp extends Component {
    constructor(props) {
        super(props);

        this.state = {
            memberId : '',
            memberPassword : '',
            memberName : '',
            memberEmail : '',
            memberAddress : '',
            memberAddressDetail: '',
            memberGender : '',
            memberPhone1 : '',
            memberPhone2 : '',
            memberPhone3 : ''
         }
    }

    changeHandler = (event) => {
        this.setState({[event.target.name] : event.target.value});
    }

    submitHandler = (event) => {
        event.preventDefault();
        console.log(this.state);
    }
    
    render() {
        const {memberId, memberPassword, memberName, memberEmail, 
            memberAddress, memberAddressDetail, memberGender, 
            memberPhone1, memberPhone2, memberPhone3} = this.state;
        return (
            <form onSubmit = {this.submitHandler}>
                <h3>회원가입</h3>

                <div className="form-group">
                    <label>아이디</label>
                    <input 
                        type="text" className="form-control"  name = "memberId"
                        placeholder="아이디" value = {memberId} onChange = {this.changeHandler} 
                    />
                </div>

                <div className="form-group">
                    <label>비밀번호</label>
                    <input 
                        type="password" className="form-control" placeholder="비밀번호" name = "memberPassword"
                        value = {memberPassword} onChange = {this.changeHandler}
                    />
                </div>

                <div className="form-group">
                    <label>이름</label>
                    <input
                        type="text" className="form-control" placeholder="이름" name = "memberName"
                        value = {memberName} onChange = {this.changeHandler}
                    />
                </div>
                <div className="form-group">
                    <label>이메일</label>
                    <input
                        type="email" className="form-control" placeholder="이메일" name = "memberEmail"
                        value = {memberEmail} onChange = {this.changeHandler}
                    />
                </div>
                <div className="custom-control custom-checkbox">
                        <input
                            type="checkbox" className="custom-control-input" id="man" 
                            //name = "memberGender"value = {memberGender} onChange = {this.changeHandler}
                        />
                        <label className="custom-control-label" htmlFor="customCheck1">남</label>
                        <input
                            type="checkbox" className="custom-control-input" id="woman"
                            //name = "memberGender"value = {memberGender} onChange = {this.changeHandler}
                        />
                        <label className="custom-control-label" htmlFor="customCheck1">여</label>
                    </div>
                <div className="form-group">
                    <label>주소</label>
                    <input 
                        type="address" className="form-control" placeholder="주소" name = "memberAddress"
                        value = {memberAddress} onChange = {this.changeHandler}
                    />
                    <input 
                        type="address" className="form-control" placeholder="상세주소" name = "memberAddressDetail"
                        value = {memberAddressDetail} onChange = {this.changeHandler}
                    />
                </div>
                <div className="form-group">
                    <label>휴대전화 번호</label>
                    <input
                        type="tel" className="form-control" name = "memberPhone1"
                        value = {memberPhone1} onChange = {this.changeHandler}
                    />
                    <input
                        type="number" className="form-control" name = "memberPhone2"
                        value = {memberPhone2} onChange = {this.changeHandler}
                    />
                    <input
                        type="number" className="form-control" name = "memberPhone3"
                        value = {memberPhone3} onChange = {this.changeHandler}
                    />
                </div>

                <button type="submit" className="btn btn-dark btn-lg btn-block" >회원 가입</button>
                <p className="forgot-password text-right">
                    Already registered <a href="/">log in?</a>
                </p>
            </form>
        );
    }
}