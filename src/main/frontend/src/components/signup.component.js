import React, { Component } from "react";

export default class SignUp extends Component {
    render() {
        return (
            <form>
                <h3>회원가입</h3>

                <div className="form-group">
                    <label>아이디</label>
                    <input type="text" className="form-control" placeholder="아이디" />
                </div>

                <div className="form-group">
                    <label>비밀번호</label>
                    <input type="password" className="form-control" placeholder="비밀번호" />
                </div>

                <div className="form-group">
                    <label>이름</label>
                    <input type="text" className="form-control" placeholder="이름" />
                </div>
                <div className="form-group">
                    <label>이메일</label>
                    <input type="email" className="form-control" placeholder="이메일" />
                </div>
                <div className="custom-control custom-checkbox">
                        <input type="checkbox" className="custom-control-input" id="man" />
                        <label className="custom-control-label" htmlFor="customCheck1">남</label>
                        <input type="checkbox" className="custom-control-input" id="woman" />
                        <label className="custom-control-label" htmlFor="customCheck1">여</label>
                    </div>
                <div className="form-group">
                    <label>주소</label>
                    <input type="address" className="form-control" placeholder="주소" />
                    <input type="address" className="form-control" placeholder="상세 주소" />
                </div>
                <div className="form-group">
                    <label>휴대전화 번호</label>
                    <input type="number" className="form-control" />
                    <input type="number" className="form-control" />
                    <input type="number" className="form-control" />
                </div>

                <button type="submit" className="btn btn-dark btn-lg btn-block">회원 가입</button>
                <p className="forgot-password text-right">
                    Already registered <a href="/">log in?</a>
                </p>
            </form>
        );
    }
}