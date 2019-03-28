import { expect } from 'chai';
import { shallowMount } from '@vue/test-utils';
import Login from '@/views/Login.vue';

describe('Login.vue', () => {
  it('includes Username and Password fields', () => {
    const wrapper = shallowMount(Login);
    expect(wrapper.text()).to.include('Username');
    expect(wrapper.text()).to.include('Password');
  });
});
